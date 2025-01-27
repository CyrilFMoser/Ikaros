package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D, b: T_A[C, C], c: C) extends T_A[C, D]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
}
}