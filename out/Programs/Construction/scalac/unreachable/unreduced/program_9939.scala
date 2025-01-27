package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Byte], T_A[Char, Int]], b: Int) extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Char]], T_A[T_A[Char, Int], T_A[Char, (Boolean,Boolean)]]]
case class CC_B(a: CC_A, b: (T_A[CC_A, (Char,Boolean)],T_A[CC_A, CC_A]), c: T_A[T_A[(Byte,Byte), CC_A], T_A[CC_A, CC_A]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Char]], T_A[T_A[Char, Int], T_A[Char, (Boolean,Boolean)]]]
case class CC_C() extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Char]], T_A[T_A[Char, Int], T_A[Char, (Boolean,Boolean)]]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Int, Char]], T_A[T_A[Char, Int], T_A[Char, (Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}