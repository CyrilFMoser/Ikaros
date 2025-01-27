package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Char])) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}