package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Boolean) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}