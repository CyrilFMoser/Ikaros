package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Boolean,Int), T_A], T_B[T_A, (Boolean,Char)]], b: T_B[T_A, (T_A,T_A)], c: (T_A,((Char,Char),T_A))) extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C[C](a: CC_A, b: CC_B, c: (CC_B,T_B[(Char,Int), T_A])) extends T_A
case class CC_D[D](a: T_B[Char, D], b: D, c: (Boolean,CC_C[CC_A])) extends T_B[Char, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
  case CC_C(_, CC_B(_), _) => 3 
}
}