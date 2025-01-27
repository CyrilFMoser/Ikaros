package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Boolean], (Char,Int)], T_A[T_A[(Int,Boolean), Int], (Int,Byte)]]
case class CC_B(a: T_A[(CC_A,CC_A), T_A[CC_A, CC_A]], b: (CC_A,T_A[CC_A, CC_A]), c: T_A[T_A[CC_A, CC_A], T_A[Char, CC_A]]) extends T_A[T_A[T_A[Char, Boolean], (Char,Int)], T_A[T_A[(Int,Boolean), Int], (Int,Byte)]]
case class CC_C(a: (CC_A,(CC_A,CC_B)), b: ((CC_B,Boolean),T_A[CC_A, CC_A]), c: CC_A) extends T_A[T_A[T_A[Char, Boolean], (Char,Int)], T_A[T_A[(Int,Boolean), Int], (Int,Byte)]]

val v_a: T_A[T_A[T_A[Char, Boolean], (Char,Int)], T_A[T_A[(Int,Boolean), Int], (Int,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_), _) => 1 
  case CC_C(_, (_,_), _) => 2 
}
}