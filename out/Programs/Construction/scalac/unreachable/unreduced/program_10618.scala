package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[Int], c: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B() extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(), _, _), _, _) => 1 
  case CC_A(CC_B(), _, _) => 2 
  case CC_B() => 3 
}
}