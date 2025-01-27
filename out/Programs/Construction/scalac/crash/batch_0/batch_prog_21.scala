package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: C) extends T_A[C, D]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}