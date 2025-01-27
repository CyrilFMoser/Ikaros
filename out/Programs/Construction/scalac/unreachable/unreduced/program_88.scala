package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[(Int,Byte), (Boolean,Boolean)], b: (T_B[Int, Int],T_B[Boolean, (Char,Byte)])) extends T_A[(T_B[Int, Boolean],T_B[Int, Byte]), T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]]]
case class CC_B() extends T_A[(T_B[Int, Boolean],T_B[Int, Byte]), T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]]]
case class CC_C(a: T_A[T_B[CC_A, CC_A], ((Char,Int),Byte)], b: CC_A) extends T_A[(T_B[Int, Boolean],T_B[Int, Byte]), T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]]]
case class CC_D[E, F]() extends T_B[T_A[Byte, (CC_B,Int)], E]
case class CC_E[G]() extends T_B[T_B[(CC_B,CC_A), CC_D[Char, (Boolean,Char)]], G]
case class CC_F() extends T_B[T_A[Byte, (CC_B,Int)], CC_A]

val v_a: T_A[(T_B[Int, Boolean],T_B[Int, Byte]), T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}