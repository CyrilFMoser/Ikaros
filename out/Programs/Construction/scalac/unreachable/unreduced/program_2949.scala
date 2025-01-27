package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Char],T_A[Int]), b: Char, c: T_B[T_A[Char]]) extends T_A[T_B[Byte]]
case class CC_B(a: T_A[T_B[Byte]]) extends T_A[T_B[Byte]]
case class CC_C() extends T_A[T_B[Byte]]

val v_a: T_A[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C()) => 3 
  case CC_C() => 4 
}
}