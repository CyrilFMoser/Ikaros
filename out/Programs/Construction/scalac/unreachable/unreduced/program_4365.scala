package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[(Boolean,Boolean)], b: C) extends T_A[C]
case class CC_B[D](a: T_A[D], b: (T_A[(Char,Int)],T_A[Byte]), c: T_B[D]) extends T_A[D]
case class CC_C() extends T_B[T_A[T_A[Byte]]]
case class CC_D(a: CC_B[T_A[CC_C]]) extends T_B[T_A[T_A[Byte]]]

val v_a: T_B[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(CC_B(_, _, _), (_,_), _)) => 1 
}
}
// This is not matched: CC_D(CC_B(CC_A(_, _), (_,_), _))