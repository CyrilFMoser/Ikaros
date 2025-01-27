package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int) extends T_A[T_A[T_A[Boolean, Char], T_A[Boolean, Char]], T_A[T_A[Int, Byte], (Char,Byte)]]
case class CC_B(a: T_A[Int, T_A[Char, CC_A]], b: (T_A[(Char,Byte), CC_A],(CC_A,CC_A)), c: CC_A) extends T_A[T_A[T_A[Boolean, Char], T_A[Boolean, Char]], T_A[T_A[Int, Byte], (Char,Byte)]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Boolean, Char]], T_A[T_A[Int, Byte], (Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B(_, (_,(_,_)), CC_A(_)) => 2 
}
}