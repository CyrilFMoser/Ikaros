package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[Boolean], c: (Byte,T_A[(Byte,Char)])) extends T_A[Boolean]
case class CC_B(a: T_A[T_B[Char, Byte]]) extends T_A[Boolean]
case class CC_C() extends T_A[Boolean]
case class CC_D(a: (CC_C,Int)) extends T_B[CC_B, Char]
case class CC_E(a: T_A[Char], b: T_B[T_B[CC_B, CC_B], CC_C]) extends T_B[CC_B, Char]
case class CC_F(a: CC_E, b: CC_C, c: T_A[Boolean]) extends T_B[CC_B, Char]

val v_a: T_B[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_D((CC_C(),_)) => 0 
  case CC_E(_, _) => 1 
  case CC_F(_, _, CC_A(_, _, (_,_))) => 2 
  case CC_F(_, _, CC_B(_)) => 3 
  case CC_F(_, _, CC_C()) => 4 
}
}