package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,(Byte,Boolean))) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: T_A[Int], c: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _, CC_A(_)) => 0 
  case CC_C(CC_A(_), CC_A(_), CC_A(_)) => 1 
}
}
// This is not matched: CC_A(_)