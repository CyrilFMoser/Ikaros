package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[(Boolean,Byte), Int], (Boolean,Boolean)]]
case class CC_B[D](a: Char) extends T_A[T_A[T_A[Int, Int], T_A[Char, Byte]], T_A[T_A[(Boolean,Byte), Int], (Boolean,Boolean)]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Char, Byte]], T_A[T_A[(Boolean,Byte), Int], (Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}