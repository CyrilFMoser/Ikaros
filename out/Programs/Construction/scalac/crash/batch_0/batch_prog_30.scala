package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Boolean) extends T_A[C, D]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}