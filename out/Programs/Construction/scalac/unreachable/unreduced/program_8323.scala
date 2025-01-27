package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[(Boolean,Char)])) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: (T_A[(Char,Byte)],CC_A), b: T_A[Char]) extends T_A[T_A[T_A[Char]]]
case class CC_C[B](a: B) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)