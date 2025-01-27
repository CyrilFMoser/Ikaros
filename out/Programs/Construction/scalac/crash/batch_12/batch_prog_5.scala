package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char, b: T_A[T_A[T_A[Char]]], c: Char) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
}
}