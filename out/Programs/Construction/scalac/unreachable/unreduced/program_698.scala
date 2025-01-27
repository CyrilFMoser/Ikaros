package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Int],T_A[Int, Int])) extends T_A[T_A[T_A[C, Int], Char], C]
case class CC_B(a: (T_A[Char, (Boolean,Boolean)],T_A[(Boolean,Char), Byte]), b: ((Boolean,Byte),Byte), c: CC_A[CC_A[(Char,Char)]]) extends T_A[T_A[T_A[CC_A[T_A[Boolean, Byte]], Int], Char], CC_A[T_A[Boolean, Byte]]]
case class CC_C() extends T_A[T_A[T_A[CC_A[T_A[Boolean, Byte]], Int], Char], CC_A[T_A[Boolean, Byte]]]

val v_a: T_A[T_A[T_A[CC_A[T_A[Boolean, Byte]], Int], Char], CC_A[T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}