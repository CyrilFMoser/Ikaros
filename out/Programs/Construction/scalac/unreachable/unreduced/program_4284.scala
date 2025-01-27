package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[CC_B[Boolean], (Byte,Int)], b: (T_A[Char, Boolean],CC_A[Int])) extends T_A[T_A[CC_B[CC_B[Char]], CC_B[CC_B[Char]]], CC_B[CC_B[Char]]]

val v_a: T_A[T_A[CC_B[CC_B[Char]], CC_B[CC_B[Char]]], CC_B[CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B())) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B()) => 3 
  case CC_A(CC_C(_, (_,_))) => 4 
  case CC_B() => 5 
  case CC_C(_, _) => 6 
}
}