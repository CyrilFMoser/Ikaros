package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: Char) extends T_A[C, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}