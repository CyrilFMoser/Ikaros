package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],Boolean), b: T_A[T_A[Int]]) extends T_A[T_A[Char]]
case class CC_B() extends T_A[T_A[Char]]
case class CC_C(a: T_A[T_A[Char]], b: T_A[T_A[Char]]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,true), _) => 0 
  case CC_A((_,false), _) => 1 
  case CC_B() => 2 
  case CC_C(_, _) => 3 
}
}