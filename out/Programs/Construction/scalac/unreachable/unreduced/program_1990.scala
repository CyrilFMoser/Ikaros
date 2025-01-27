package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Boolean,(Char,Boolean)), Boolean], b: Int) extends T_A[Byte, Byte]
case class CC_B(a: (T_A[Byte, Byte],CC_A), b: CC_A) extends T_A[Byte, Byte]
case class CC_C(a: CC_A) extends T_A[Byte, Byte]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_) => 3 
}
}