package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_B[T_A, Byte]]) extends T_A
case class CC_B(a: CC_A, b: Int) extends T_A
case class CC_C(a: T_A, b: ((CC_A,T_A),CC_B)) extends T_A
case class CC_D[C](a: (Int,CC_A), b: CC_C, c: CC_A) extends T_B[C, CC_B]
case class CC_E[D]() extends T_B[D, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_C(CC_A(_), ((_,_),CC_B(_, _))) => 2 
  case CC_C(CC_B(_, _), ((_,_),CC_B(_, _))) => 3 
  case CC_C(CC_C(CC_A(_), (_,_)), ((_,_),CC_B(_, _))) => 4 
  case CC_C(CC_C(CC_B(_, _), (_,_)), ((_,_),CC_B(_, _))) => 5 
}
}
// This is not matched: CC_C(CC_C(CC_C(_, _), (_,_)), ((_,_),CC_B(_, _)))