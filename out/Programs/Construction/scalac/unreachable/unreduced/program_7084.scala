package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[Byte, Char], T_A[T_A[Byte, Char], T_A[Byte, Char]]], b: (((Int,Byte),Int),Int), c: (T_A[Boolean, Boolean],T_A[Boolean, Byte])) extends T_A[D, T_A[D, D]]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C(a: T_B[T_B[Int]]) extends T_B[T_B[Int]]
case class CC_D[G](a: G, b: Boolean, c: G) extends T_B[T_B[Int]]
case class CC_E[H](a: T_A[H, T_A[H, H]]) extends T_B[H]

val v_a: T_B[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(_, true, _)) => 1 
  case CC_C(CC_D(_, false, _)) => 2 
  case CC_C(CC_E(CC_A(_, _, _))) => 3 
  case CC_D(_, _, _) => 4 
  case CC_E(CC_A(CC_A(_, _, _), (_,_), (_,_))) => 5 
  case CC_E(CC_A(CC_B(), (_,_), (_,_))) => 6 
  case CC_E(CC_B()) => 7 
}
}
// This is not matched: CC_C(CC_E(CC_B()))