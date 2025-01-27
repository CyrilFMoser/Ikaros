package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_A[D, D]) extends T_A[T_B[T_A[Byte, Int]], D]
case class CC_B[E](a: (T_A[Int, Boolean],Boolean)) extends T_B[E]
case class CC_C[F](a: F, b: CC_B[F], c: (T_B[Byte],T_B[(Byte,Char)])) extends T_B[F]
case class CC_D[G](a: G) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_B((_,_)), (CC_B(_),CC_B(_))) => 1 
  case CC_C(_, CC_B((_,_)), (CC_B(_),CC_C(_, _, _))) => 2 
  case CC_C(_, CC_B((_,_)), (CC_B(_),CC_D(_))) => 3 
  case CC_C(_, CC_B((_,_)), (CC_C(_, _, _),CC_B(_))) => 4 
  case CC_C(_, CC_B((_,_)), (CC_C(_, _, _),CC_C(_, _, _))) => 5 
  case CC_C(_, CC_B((_,_)), (CC_D(_),CC_B(_))) => 6 
  case CC_C(_, CC_B((_,_)), (CC_D(_),CC_C(_, _, _))) => 7 
  case CC_C(_, CC_B((_,_)), (CC_D(_),CC_D(_))) => 8 
  case CC_D(_) => 9 
}
}
// This is not matched: CC_C(_, CC_B((_,_)), (CC_C(_, _, _),CC_D(_)))