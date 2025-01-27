package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[T_A[Int, Int]], D]
case class CC_B[E](a: T_B[E], b: (Byte,CC_A[(Byte,Boolean)])) extends T_B[E]
case class CC_C[F](a: (T_B[Byte],T_A[Byte, Boolean]), b: T_B[F], c: T_B[F]) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_, _, _), _), _) => 1 
  case CC_B(CC_C((_,_), CC_B(_, _), CC_B(_, _)), _) => 2 
  case CC_B(CC_C((_,_), CC_B(_, _), CC_C(_, _, _)), _) => 3 
  case CC_B(CC_C((_,_), CC_C(_, _, _), CC_B(_, _)), _) => 4 
  case CC_B(CC_C((_,_), CC_C(_, _, _), CC_C(_, _, _)), _) => 5 
  case CC_C((CC_B(_, _),_), CC_B(_, _), _) => 6 
  case CC_C((CC_C(_, _, _),_), CC_B(_, _), _) => 7 
  case CC_C((CC_B(_, _),_), CC_C(_, _, _), _) => 8 
  case CC_C((CC_C(_, _, _),_), CC_C(_, _, _), _) => 9 
}
}