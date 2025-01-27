package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D], c: Char) extends T_A[D]
case class CC_B(a: T_B[Int, Int], b: T_B[CC_A[Int], T_A[Byte]], c: CC_A[Boolean]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_B[Char, CC_B]) extends T_B[Char, CC_B]
case class CC_D(a: (CC_A[CC_B],CC_B), b: ((CC_C,Char),Boolean), c: CC_A[CC_A[CC_B]]) extends T_B[Char, CC_B]
case class CC_E(a: CC_B, b: (T_B[Char, CC_B],CC_B), c: CC_B) extends T_B[Char, CC_B]

val v_a: T_B[Char, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_, _, _))) => 1 
  case CC_C(CC_C(CC_E(_, _, _))) => 2 
  case CC_C(CC_D(_, _, _)) => 3 
  case CC_C(CC_E(CC_B(_, _, _), _, CC_B(_, _, _))) => 4 
  case CC_D((CC_A(_, _, _),CC_B(_, _, _)), ((_,_),_), CC_A(_, _, _)) => 5 
  case CC_E(CC_B(_, _, _), _, _) => 6 
}
}