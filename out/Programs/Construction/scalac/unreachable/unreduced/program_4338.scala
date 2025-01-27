package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Boolean,Char), C]) extends T_A[(Boolean,Char), C]
case class CC_B[D, E](a: (T_A[Boolean, Boolean],Boolean), b: CC_A[E], c: T_A[D, D]) extends T_A[(Boolean,Char), D]
case class CC_C(a: (Char,(Boolean,Byte)), b: T_A[CC_A[Int], CC_B[Int, (Byte,Char)]]) extends T_A[(Boolean,Char), T_A[(Boolean,Char), Int]]

val v_a: T_A[(Boolean,Char), T_A[(Boolean,Char), Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(_, _)) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C((_,(_,_)), _) => 6 
}
}