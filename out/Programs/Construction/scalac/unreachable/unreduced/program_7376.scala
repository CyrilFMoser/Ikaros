package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[Boolean, Boolean],T_A[(Int,Char)]), b: T_B[T_A[Byte], T_A[Boolean]], c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: CC_A, b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C[D](a: T_A[T_A[D]]) extends T_A[D]
case class CC_D[E](a: E, b: E) extends T_B[E, CC_C[CC_B]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A((_,_), _, CC_A(_, _, _))) => 1 
  case CC_B(_, CC_A((_,_), _, CC_B(_, _))) => 2 
  case CC_B(_, CC_A((_,_), _, CC_C(_))) => 3 
  case CC_B(_, CC_B(CC_A(_, _, _), _)) => 4 
  case CC_C(CC_C(CC_C(_))) => 5 
}
}
// This is not matched: CC_B(_, CC_C(CC_C(_)))