package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[T_A[(Byte,Int)]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[T_A[(Byte,Boolean)]], b: T_A[CC_A], c: CC_A) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: Boolean, b: CC_B) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _)