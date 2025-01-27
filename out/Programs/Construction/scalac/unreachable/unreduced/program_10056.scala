package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Boolean],T_A[Byte, Char])) extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[T_A[Int, Boolean]], b: T_A[(Boolean,(Char,Boolean)), T_A[Int, Boolean]], c: T_A[T_A[(Boolean,Char), (Boolean,Char)], (Boolean,Char)]) extends T_A[T_A[Int, Int], Int]
case class CC_C() extends T_A[T_A[Int, Int], Int]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}