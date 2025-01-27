package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[((Char,Byte),Char), T_A[Int, Boolean]], T_A[T_A[(Int,Byte), Char], T_A[Int, Boolean]]]
case class CC_B(a: (T_A[CC_A, (Int,Int)],T_A[(Boolean,Boolean), CC_A]), b: CC_A) extends T_A[T_A[((Char,Byte),Char), T_A[Int, Boolean]], T_A[T_A[(Int,Byte), Char], T_A[Int, Boolean]]]

val v_a: T_A[T_A[((Char,Byte),Char), T_A[Int, Boolean]], T_A[T_A[(Int,Byte), Char], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), CC_A()) => 1 
}
}