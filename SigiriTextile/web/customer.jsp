<%-- 
    Document   : customer
    Created on : Feb 26, 2012, 11:01:14 AM
    Author     : Pancha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link rel="icon" href="images/logo_link.png">
        <title>Sigiri - Stock Management</title>
        <link rel="stylesheet" href="css/div_styles.css" type="text/css" />
        <link rel="stylesheet" href="verticaltabs/css/verticaltabs.css" />
        <link rel="stylesheet" href="css/formstyle.css" type="text/css"/>

        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="verticaltabs/js/verticaltabs.pack.js"></script> <!--http://dean.edwards.name/packer/-->

        <script type="text/javascript">
            $(document).ready(function(){
                $("#textExample").verticaltabs({speed: 500,slideShow: false,activeIndex:0});

            });
        </script>


    </head>

    <body>

        <div class="container">
            <table width="100%" height="114">
                <tr>
                    <td width="116" height="108"><center><img src="images/logo.png"/></center></td>
                    <td width="612" style="padding-left:8px;color:#000079;font-size:20px;font-family:'Lucida Sans Unicode', 'Lucida Grande', sans-serif;">

                        <p>Sigiri Textile Industries (Pvt) Ltd.        </p>
                        <p>No:227/1,
                            Galle Road,Katubedda,
                            Mt.Lavinia,
                            Sri Lanka. </p></td>
                    <td width="458">&nbsp;</td>
                </tr>
            </table>
            <table width="100%" height="80" >
                <!-- Text Example -->
                <div class="verticalslider" id="textExample">
                    <ul class="verticalslider_tabs">
                        <li style="margin-top:25px;"><a href="#">Customer & Operation</a></li>
                        <li><a href="#">Add Customer</a></li>
                        <li><a href="#">Search Customer</a></li>
                        <li><a href="#">Edit Customer</a></li>
                        <li><a href="#">Customer List</a></li>


                    </ul>
                    <ul class="verticalslider_contents">
                        <li>


                        </li>

                        <li style="padding-left:50px;">

                            <form action="AddCustomer.action" method="post">

                                <fieldset style="height:450px;width:600px;">
                                    <legend>Customer Details</legend>
                                    <div>
                                        <p><label for="input-one" class="float" ><strong>Name:</strong></label>
                                            <input class="inp-text" name="name" id="name" type="text" size="30" /><br/></p>

                                        <P><label for="input-two" class="float"  style="padding-top:10px;"><strong>Address:</strong></label><br />
                                            <textarea rows="1" cols="10"  class="inp-text" id="address"name="address"></textarea> <br/></P>

                                        <p><label for="input-three" class="float"><strong>VAT Number:</strong></label>
                                            <input class="inp-text" name="vatNumber" id="vat" type="text" size="30"/></p>

                                        <p><label for="input-four" class="float"><strong>SVAT Number:</strong></label>
                                            <input class="inp-text" name="svatNumber" id="svat" type="text" size="30"/></p>

                                        <p><label for="input-five" class="float"><strong>TQB Number:</strong></label>
                                            <input class="inp-text" name="tqbNumber" id="tqb" type="text" size="30"/></p>

                                        <p><label for="input-six" class="float"><strong>Telephone:</strong></label>
                                            <input class="inp-text" name="telephone" id="tel" type="text" size="30"/></p>

                                        <p><label for="input-seven" class="float"><strong>Fax:</strong></label>
                                            <input class="inp-text" name="fax" id="fax" type="text" size="30"/></p>

                                        <p><label for="input-eight" class="float"><strong>Owner:</strong></label>
                                            <input class="inp-text" name="owner" id="own" type="text" size="30"/></p>

                                        <p style="padding-left:300px;"><input class="submit-button" type="submit" alt="SUBMIT" name="Submit" value="Submit"/>

                                        </p>
                                    </div>
                                </fieldset>


                            </form>
                        </li>

                        <li>



                        </li>
                        <li style="padding-left:50px;">

                            <form action="" >

                                <fieldset style="height:500px;width:600px;">
                                    <legend>Update Customer</legend>



                                    <p><label for="input-one" class="float" ><strong>Select:</strong></label>
                                    <form action="">
                                        <select name="menu" style="width:310px;">
                                            <option value="0" selected>Select Customer</option>
                                            <s:iterator value="list" var="customer">
                                                <option value="${customer.id}">${customer.name}</option>
                                            </s:iterator>
                                        </select>
                                    </form>
                                    </p>

                                    <p><label for="input-one" class="float" style="padding-top:10px;"><strong>Name:</strong></label><br/>
                                        <input class="inp-text" name="input-name" id="name" type="text" size="30"/></br></p>

                                    <P><label for="input-two" class="float"  style="padding-top:10px;"><strong>Address:</strong></label><br />
                                        <textarea rows="1" cols="10"  class="inp-text" id="address"name="input-address"></textarea> <br/></P>

                                    <p><label for="input-three" class="float"><strong>VAT Number:</strong></label>
                                        <input class="inp-text" name="input-vat" id="vat" type="text" size="30"/></p>

                                    <p><label for="input-four" class="float"><strong>SVAT Number:</strong></label>
                                        <input class="inp-text" name="input-svat" id="svat" type="text" size="30"/></p>

                                    <p><label for="input-five" class="float"><strong>TQB Number:</strong></label>
                                        <input class="inp-text" name="input-tqb" id="tqb" type="text" size="30"/></p>

                                    <p><label for="input-six" class="float"><strong>Telephone:</strong></label>
                                        <input class="inp-text" name="input-tel" id="tel" type="text" size="30"/></p>

                                    <p><label for="input-seven" class="float"><strong>Fax:</strong></label>
                                        <input class="inp-text" name="input-fax" id="fax" type="text" size="30"/></p>

                                    <p><label for="input-eight" class="float"><strong>Owner:</strong></label>
                                        <input class="inp-text" name="input-own" id="own" type="text" size="30"/></p>

                                    <p style="padding-left:300px;"><input class="submit-button" type="submit" alt="SUBMIT" name="Submit" value="Update" />

                                    </p>

                                </fieldset>


                            </form>
                        </li>



                    </ul>
                    <div style="padding-top:600px;padding-left:290px;">
                        <fieldset style="height:35px;width:600px;">
                            <a href="customer_order.jsp" ><h2>click here to Enter Place order</h2></a>

                        </fieldset>
                    </div>
                </div>

            </table>



        </tr>
    </table>


    <table width="100%" height="100" border="1">
        <tr>
            <td></td>
        </tr>
    </table>


</div>

</body>
</html>
