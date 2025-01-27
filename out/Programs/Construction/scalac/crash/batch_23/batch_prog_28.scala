package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B], c: Int) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
}
}