package Program_11 

 object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A], b: CC_A) extends T_A
case class CC_C(a: (T_A,Boolean), b: Byte) extends T_A
case class CC_D[B](a: B) extends T_B[B]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}