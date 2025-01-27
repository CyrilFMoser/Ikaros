package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Char, Byte], Int], C]
case class CC_B(a: T_A[T_A[(Int,Int), Byte], T_A[Int, (Boolean,Byte)]], b: (CC_A[Char],T_A[(Byte,Byte), Char]), c: CC_A[Byte]) extends T_A[T_A[T_A[Char, Byte], Int], T_A[CC_A[Boolean], T_A[Boolean, Byte]]]
case class CC_C[D](a: D) extends T_A[T_A[T_A[Char, Byte], Int], D]

val v_a: T_A[T_A[T_A[Char, Byte], Int], CC_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_B(_, (_,_), CC_A())) => 1 
}
}