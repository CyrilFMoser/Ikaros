package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: (T_A[Boolean, Byte],(Boolean,Boolean))) extends T_A[E, F]
case class CC_B() extends T_A[T_B[CC_A[Int, Int], Byte], T_A[T_A[(Int,Int), Boolean], T_A[Char, (Int,Char)]]]
case class CC_C(a: Int, b: CC_B, c: CC_B) extends T_B[CC_A[CC_A[CC_B, CC_B], T_A[CC_B, (Boolean,Char)]], T_B[T_A[CC_B, CC_B], T_B[CC_B, CC_B]]]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),(_,_))) => 0 
}
}