package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Char,Boolean), T_A[Int, Byte]], C]
case class CC_B(a: CC_A[CC_A[Boolean]], b: CC_A[T_A[Boolean, Byte]], c: T_A[CC_A[Byte], Int]) extends T_A[T_A[(Char,Boolean), T_A[Int, Byte]], (Boolean,T_A[Byte, Char])]

val v_a: T_A[T_A[(Char,Boolean), T_A[Int, Byte]], (Boolean,T_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
}
}