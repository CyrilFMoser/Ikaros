package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: Byte) extends T_A[Char, T_A[Int, T_A[Byte, Boolean]]]
case class CC_B(a: (T_A[CC_A, CC_A],CC_A), b: (Byte,(CC_A,CC_A)), c: CC_A) extends T_A[Char, T_A[Int, T_A[Byte, Boolean]]]
case class CC_C(a: T_A[Boolean, Int]) extends T_A[Char, T_A[Int, T_A[Byte, Boolean]]]

val v_a: T_A[Char, T_A[Int, T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_B((_,CC_A(_, _)), (0,(_,_)), CC_A(_, _)) => 2 
  case CC_B((_,CC_A(_, _)), (_,(_,_)), CC_A(_, _)) => 3 
  case CC_C(_) => 4 
}
}