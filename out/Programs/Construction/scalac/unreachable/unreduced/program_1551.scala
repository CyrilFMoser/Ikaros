package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: (T_A[(Char,Char)],T_A[CC_A]), b: T_A[T_A[CC_A]]) extends T_A[T_A[Boolean]]
case class CC_C() extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)