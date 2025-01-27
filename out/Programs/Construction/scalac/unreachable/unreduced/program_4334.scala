package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Char, Boolean],T_A[Char, Boolean]), b: (T_A[Byte, Byte],T_A[Char, Byte])) extends T_A[(T_A[Boolean, Int],T_A[Int, Int]), T_A[(Boolean,Byte), T_A[Int, Char]]]
case class CC_B() extends T_A[(T_A[Boolean, Int],T_A[Int, Int]), T_A[(Boolean,Byte), T_A[Int, Char]]]
case class CC_C(a: T_A[T_A[(Char,Boolean), CC_B], CC_A]) extends T_A[(T_A[Boolean, Int],T_A[Int, Int]), T_A[(Boolean,Byte), T_A[Int, Char]]]

val v_a: T_A[(T_A[Boolean, Int],T_A[Int, Int]), T_A[(Boolean,Byte), T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}