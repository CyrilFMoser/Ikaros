package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[Char, Byte]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: ((Int,CC_A),T_A[Int, T_B])) extends T_B
case class CC_D(a: Boolean) extends T_B

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(CC_B(_))) => 0 
  case CC_A(CC_B(CC_C(_))) => 1 
  case CC_A(CC_B(CC_D(_))) => 2 
  case CC_A(CC_C((_,_))) => 3 
}
}
// This is not matched: CC_A(CC_D(_))