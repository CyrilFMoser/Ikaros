package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[T_A[(Char,Int)]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_B, b: T_A[T_A[Char]], c: CC_A) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(CC_B(_), _, _)