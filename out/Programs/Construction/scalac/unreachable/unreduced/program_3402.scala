package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Int], Boolean], T_A[T_A[(Char,Byte), Int], T_A[Int, Int]]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[CC_A, CC_A], Char]) extends T_A[T_A[T_A[Byte, Int], Boolean], T_A[T_A[(Char,Byte), Int], T_A[Int, Int]]]
case class CC_C[C]() extends T_A[T_A[T_A[Byte, Int], Boolean], T_A[T_A[(Char,Byte), Int], T_A[Int, Int]]]

val v_a: T_A[T_A[T_A[Byte, Int], Boolean], T_A[T_A[(Char,Byte), Int], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_C() => 2 
}
}