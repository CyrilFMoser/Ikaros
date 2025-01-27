package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Char]], Int]
case class CC_B(a: T_A[((Boolean,Boolean),Int), Int], b: CC_A, c: Byte) extends T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Char]], Int]
case class CC_C(a: Int) extends T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Char]], Int]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), 0) => 1 
  case CC_B(_, CC_A(), _) => 2 
  case CC_C(_) => 3 
}
}