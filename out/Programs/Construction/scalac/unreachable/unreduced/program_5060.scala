package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Boolean, C]
case class CC_B[D](a: T_A[D, D], b: T_B, c: T_B) extends T_A[Boolean, D]
case class CC_C() extends T_A[Boolean, T_A[Boolean, Char]]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}