package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Byte], Int], (T_A[Boolean, (Char,Byte)],T_A[Int, Char])]
case class CC_B(a: T_A[CC_A, CC_A], b: T_A[CC_A, CC_A]) extends T_A[T_A[T_A[Char, Byte], Int], (T_A[Boolean, (Char,Byte)],T_A[Int, Char])]
case class CC_C(a: CC_A, b: CC_A) extends T_A[T_A[T_A[Char, Byte], Int], (T_A[Boolean, (Char,Byte)],T_A[Int, Char])]

val v_a: T_A[T_A[T_A[Char, Byte], Int], (T_A[Boolean, (Char,Byte)],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(), CC_A()) => 2 
}
}