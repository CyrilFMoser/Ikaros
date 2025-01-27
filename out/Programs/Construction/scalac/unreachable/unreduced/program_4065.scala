package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, Byte]]
case class CC_B[D]() extends T_A[D, T_A[D, Byte]]
case class CC_C(a: CC_B[T_A[Char, (Int,Boolean)]], b: (Int,T_A[T_B, T_B])) extends T_B
case class CC_D(a: T_A[(CC_C,Byte), T_A[(CC_C,Byte), Byte]]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, (_,_)) => 0 
  case CC_D(CC_A()) => 1 
  case CC_D(CC_B()) => 2 
  case CC_E() => 3 
}
}