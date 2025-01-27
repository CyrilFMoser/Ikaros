package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: CC_A, c: (Byte,T_A[CC_A])) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_), (_,_)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)