package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: (Byte,Boolean)) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Boolean]], T_A[Byte, Boolean]], b: T_A[CC_A[Int], CC_A[Byte]], c: T_A[T_A[Int, Int], Int]) extends T_A[T_A[(T_A[Char, Byte],T_A[(Boolean,Boolean), Int]), (T_A[Char, Byte],T_A[(Boolean,Boolean), Int])], (T_A[Char, Byte],T_A[(Boolean,Boolean), Int])]

val v_a: T_A[T_A[(T_A[Char, Byte],T_A[(Boolean,Boolean), Int]), (T_A[Char, Byte],T_A[(Boolean,Boolean), Int])], (T_A[Char, Byte],T_A[(Boolean,Boolean), Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(CC_A(CC_A(_, _), _), _, CC_A(CC_A(_, _), _)) => 1 
}
}