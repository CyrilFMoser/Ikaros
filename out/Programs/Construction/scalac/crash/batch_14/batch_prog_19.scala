package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D, b: T_A[C, D], c: D) extends T_A[C, D]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}