package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[(Boolean,Char)]) extends T_A[E, D]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C[I, H](a: Int) extends T_A[H, I]
case class CC_D(a: Byte, b: CC_B[CC_A[Int, Char], T_A[Byte, Boolean]]) extends T_B[(CC_C[Boolean, Boolean],Int)]
case class CC_E(a: T_A[T_B[CC_D], (CC_D,CC_D)], b: ((CC_D,CC_D),CC_C[CC_D, (Byte,Byte)]), c: T_A[T_A[CC_D, CC_D], T_A[CC_D, CC_D]]) extends T_B[(CC_C[Boolean, Boolean],Int)]

val v_a: T_B[(CC_C[Boolean, Boolean],Int)] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_A(_), ((_,_),CC_C(_)), CC_A(_)) => 1 
  case CC_E(CC_A(_), ((_,_),CC_C(_)), CC_B()) => 2 
  case CC_E(CC_A(_), ((_,_),CC_C(_)), CC_C(12)) => 3 
  case CC_E(CC_A(_), ((_,_),CC_C(_)), CC_C(_)) => 4 
  case CC_E(CC_B(), ((_,_),CC_C(_)), CC_A(_)) => 5 
  case CC_E(CC_B(), ((_,_),CC_C(_)), CC_C(12)) => 6 
  case CC_E(CC_B(), ((_,_),CC_C(_)), CC_C(_)) => 7 
  case CC_E(CC_C(_), ((_,_),CC_C(_)), CC_A(_)) => 8 
  case CC_E(CC_C(_), ((_,_),CC_C(_)), CC_B()) => 9 
  case CC_E(CC_C(_), ((_,_),CC_C(_)), CC_C(12)) => 10 
  case CC_E(CC_C(_), ((_,_),CC_C(_)), CC_C(_)) => 11 
}
}
// This is not matched: CC_E(CC_B(), ((_,_),CC_C(_)), CC_B())