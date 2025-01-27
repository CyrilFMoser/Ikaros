package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Boolean, Boolean]], b: Byte) extends T_A[T_B[T_B[Byte]], (T_B[Byte],T_B[(Int,Int)])]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A, CC_A], T_B[CC_A]], c: (CC_A,T_B[CC_A])) extends T_A[T_B[T_B[Byte]], (T_B[Byte],T_B[(Int,Int)])]
case class CC_C(a: T_B[Int], b: T_A[CC_B, CC_B]) extends T_A[T_B[T_B[Byte]], (T_B[Byte],T_B[(Int,Int)])]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: CC_D[E], b: T_A[E, E]) extends T_B[E]

val v_a: T_A[T_B[T_B[Byte]], (T_B[Byte],T_B[(Int,Int)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(CC_D(), _) => 1 
  case CC_C(CC_E(_, _), _) => 2 
}
}
// This is not matched: CC_B(CC_A(_, _), _, (_,_))