package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (T_A[Byte, Boolean],T_B[Int, Byte]), b: (T_A[Int, Char],T_B[Boolean, Boolean])) extends T_A[F, E]
case class CC_B[G, H]() extends T_A[H, G]
case class CC_C[I, J](a: T_A[J, J], b: T_B[J, J], c: T_A[I, J]) extends T_A[I, J]
case class CC_D[K](a: ((Byte,Boolean),T_A[Char, Byte]), b: T_A[K, K]) extends T_B[Boolean, K]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),_), (CC_A(_, _),CC_D(_, _))) => 0 
  case CC_A((CC_A(_, _),_), (CC_B(),CC_D(_, _))) => 1 
  case CC_A((CC_A(_, _),_), (CC_C(_, _, _),CC_D(_, _))) => 2 
  case CC_A((CC_B(),_), (CC_A(_, _),CC_D(_, _))) => 3 
  case CC_A((CC_B(),_), (CC_C(_, _, _),CC_D(_, _))) => 4 
  case CC_A((CC_C(_, _, _),_), (CC_A(_, _),CC_D(_, _))) => 5 
  case CC_A((CC_C(_, _, _),_), (CC_B(),CC_D(_, _))) => 6 
  case CC_A((CC_C(_, _, _),_), (CC_C(_, _, _),CC_D(_, _))) => 7 
  case CC_B() => 8 
  case CC_C(_, _, _) => 9 
}
}
// This is not matched: CC_A((CC_B(),_), (CC_B(),CC_D(_, _)))